const express = require("express");
const bodyParser = require("body-parser");
const path = require('path');
const app = express();
const port = 3000;

const readCallRouter = require('./routes/readCall')

app.use(bodyParser.json());
app.use(bodyParser.urlencoded({ extended: true }));

// app.use(session({
//   secret: 'my-secret',
//   resave: false,
//   saveUninitialized: true,
//   cookie: { secure: true }
// }));

// 静态路由
// app.use(express.static(path.join(__dirname,'')));
//express框架解决跨域问题的代码，注意该代码要放在 app.use(router); 之前

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

//测试get请求
app.get('/getbooks', function (request, response) {
  let books = {
    "status": 200,
    "msg": "获取图书列表成功",
    "data": [
      {
        "id": 1,
        "bookname": "西游记",
        "author": "吴承恩",
        "publisher": "北京图书出版社"
      },
      {
        "id": 2,
        "bookname": "红楼梦",
        "author": "曹雪芹",
        "publisher": "上海图书出版社"
      },
      {
        "id": 3,
        "bookname": "三国演义",
        "author": "罗贯中",
        "publisher": "北京图书出版社"
      }
    ]
  }
//response.send是express框架提供的方法，相当于结束本次请求。
  response.send(books)
})

//测试post请求
// 接口2--post普通键值对格式a=1&b=2
app.post('/addbooks', (request, response) => {
  //request.body发送的请求的参数
  console.log('请求返回', request.body)
  //response.send响应回来的参数
  response.send({ a: 1 })
})



// 会自动加入req.body属性，这个属性中就包含了post请求所传入的参数,格式为json格式
// app.use(express.json())
 
// 接口3--post-json格式
app.post('/add-json', (request, response) => {
  console.log('请求返回', request.body)
  response.send({ "name": "xxx" })
})



app.use('/api/readCall',readCallRouter);
// const PORT = 3000;
app.listen(port, ()=> {
  console.log("Server started on port  3000 端口!");
});


