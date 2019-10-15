var express = require('express');
var app = express();

app.listen(3000,function(){
    console.info('O servidor esta rodando na porta 3000');
});

const rest = require('./index.js');

rest(app);

module.exports = app;
