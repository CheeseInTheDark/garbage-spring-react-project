let example = require('./example')

async function start() {
    await example("Hi dere!")
    console.log("Waited for really cool alert to show")
}

start()