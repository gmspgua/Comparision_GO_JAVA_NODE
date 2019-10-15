module.exports = (app) =>{
app.get('/api/hello',(req, resp) =>
    resp.send("Hello World")
);
}