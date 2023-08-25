const express = require("express");
const bodyParser = require("body-parser");
const path = require('path');
const cors = require("cors"); // 引入 cors 模块
const app = express();
const port = 3000;

const readCallRouter = require('./routes/readCall')

app.use(bodyParser.json());
app.use(bodyParser.urlencoded({ extended: true }));

// 使用 cors 中间件
app.use(cors()); // 添加此行来启用 CORS

// app.use(session({
//   secret: 'my-secret',
//   resave: false,
//   saveUninitialized: true,
//   cookie: { secure: true }
// }));


app.all('*', function (req, res, next) {
  res.header('Access-Control-Allow-Origin', '*')
  res.header('Access-Control-Allow-Headers', 'Content-Type,Content-Length, Authorization, Accept,X-Requested-With')
  res.header('Access-Control-Allow-Methods', 'PUT,POST,GET,DELETE,OPTIONS')
  res.header('X-Powered-By', ' 3.2.1')
  req.method == "OPTIONS" ? res.send(200) : next()
})


// 静态路由
app.use(express.static(path.join(__dirname,'')));
//express框架解决跨域问题的代码，注意该代码要放在 app.use(router); 之前

// 访问根路由
app.get('/',(req,res) => {
  console.log(req.query)
	res.send('Hello World')
})





app.use('/api/readCall',readCallRouter);
// const PORT = 3000;
app.listen(port, ()=> {
  console.log("Server started on port  3000 端口!");
});


