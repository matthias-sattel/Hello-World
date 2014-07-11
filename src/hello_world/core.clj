(ns hello-world.core
  (:gen-class)
  (:require [clojure.core.async :as async]))

(defn handler [request]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body "<h1>Hello World!</h1>"})

(def hello-world-channel (async/chan))

(defn put-hello-to-channel []
  (async/go (async/>! hello-world-channel "Hello World")))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  ;; work around dangerous default behaviour in Clojure
  (alter-var-root #'*read-eval* (constantly false))
  (println "Hello, World!"))
