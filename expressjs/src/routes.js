const { getTransactions, getSingleTransaction, createTransaction } = require('./controllers');

function routes(app) {
    // STEP 5 : Adding the route to view transactions
    app.get("/transactions", getTransactions);

    // STEP 8 : Connecting routes
    app.get("/transactions/:id", getSingleTransaction);
    app.post("/transactions", createTransaction);
}

module.exports = routes;