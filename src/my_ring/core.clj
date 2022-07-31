(ns my-ring.core
  (:require [ring.adapter.jetty :as jetty]
            [ring.middleware.reload :as reload]))

(defn handler [request]
  {:status 200
   :headers {"Content-Type" "text/plain"}
   :body "Hello Clojure, Helwwwwwlll3333333llo Ring!"})

(defn -main []
  (jetty/run-jetty (reload/wrap-reload #'handler) {:port 3000
                                                   :join? false}))

(comment
  (-main))