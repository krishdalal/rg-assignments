const txnService = require('../services');

async function getTransactions(req, res) {
    // STEP 4 : Implementing the controller to view transactions
    const val = await txnService.getTransactions();
    return res.json(val);
}

async function getSingleTransaction(req, res) {
    // STEP 6 : Doing the same to the second endpoint
    const val = await txnService.getTransactions(req.params.id);
    return res.json(val);
}

async function createTransaction(req, res) {
    // STEP 7 : The third endpoint
    const details = req.body;
    const newId = await txnService.createTransaction(details);
    return res.status(201).json(newId);
}

module.exports = { getTransactions, getSingleTransaction, createTransaction };