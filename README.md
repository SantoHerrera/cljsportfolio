# Yet another React playground, but in ClojureScript 
[![Netlify Status](https://api.netlify.com/api/v1/badges/bdd7eb11-42ac-45fa-947c-96af3958636e/deploy-status)](https://app.netlify.com/sites/todolist-cljs-reagent-leovalais/deploys)

### Development mode
To start the Figwheel compiler, navigate to the project folder and run the following command in the terminal:

```
lein figwheel
```

Figwheel will automatically push cljs changes to the browser.
Once Figwheel starts up, you should be able to open the `public/index.html` page in the browser.

### REPL

The project is setup to start nREPL on port `7002` once Figwheel starts.
Once you connect to the nREPL, run `(cljs)` to switch to the ClojureScript REPL.

### Building for production

```
lein clean
lein package
```
