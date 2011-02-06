(ns renegademomo.core
  (:require [appengine-magic.core :as ae]))


(defn renegademomo-app-handler [request]
  {:status 200
   :headers {"Content-Type" "text/plain"}
   :body "Hello, world!"})


(ae/def-appengine-app renegademomo-app #'renegademomo-app-handler)