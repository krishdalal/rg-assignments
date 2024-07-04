const fs = require('fs').promises;
const path = require('path');

async function displayTransactions() {
  try {
    // TODO: Read 'transactions.json' file using fs.readFile or fs.readFile with async/await
 
    const data = await fs.readFile('data/transactions.json');
    console.log(JSON.parse(data));

  } catch (error) {
    // TODO: Handle errors that occur during file reading or JSON parsing

    console.error('Error reading or parsing transactions.json: ', error);

  }
}

displayTransactions();
