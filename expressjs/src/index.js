const express = require('express');
const morgan = require('morgan');
const bodyParser = require('body-parser');

// STEP 2 : Configuring express
const routes = require('./routes');

const app = express();

app.use(morgan('dev'));
app.use(bodyParser.json());
app.use(bodyParser.urlencoded({ extended: true }));

routes(app);

const port = process.env.PORT || 3000;
app.listen(port, () => {
  console.log(`Server is running on port ${port}`);
});
