const uuid = require('uuid');

const TXNS = [
    {id: "6166789c-7268-4cfe-8b34-bc8d99cc0581", timestamp: 1626595642375, to: "restaurant", amount: 500},
    {id: "4ad1b27a-28da-45e1-9037-255e8b51b7f6", timestamp: 1626595765426, to: "anjali", amount: 120}
];

const txnService = {
    async getTransactions(id) {
        // STEP 6 : Doing the same to the second endpoint
        if(id){
            const txn = TXNS.find(t => t.id === id);
            return Promise.resolve(txn);
        }
        // STEP 3 : Implementing the service to view transactions
        return Promise.resolve(TXNS);
    },

    async createTransaction({to, amount}) {
        // STEP 7 : The third endpoint
        const newTxn = { id: uuid.v4(), timestamp: Date.now(), to, amount };
        TXNS.push(newTxn);
        return Promise.resolve(newTxn.id);
    }
}

module.exports = txnService;