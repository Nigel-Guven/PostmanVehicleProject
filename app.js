
const http = require('http');
const express = require('express');
const app = express();

app.get('/', (req, res) => {
    res.send('Hello World...Great Success');
});

app.get('/api/courses', (req, res) => {
    res.send([1, 2, 3]);
});

// PORT
const port = process.env.PORT || 3000;
app.listen(port, () => console.log(`Listening in on Port ${port}....Great Success!!`));


/*
const server = http.createServer((req, res) => {
    if (req.url === '/')
    {
        res.write('Hello World');
        res.end();
    }

    if (req.url === 'api/courses')
    {
        res.write(JSON.stringify([1, 2, 3]));
        res.end();
    }
});

server.listen(3000);

console.log('Listening in on Port 3000....Great Success!!');

*/