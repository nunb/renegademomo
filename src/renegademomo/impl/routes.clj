(ns renegademomo.impl.routes
  (:use [compojure.core :only [defroutes GET]])
  (:require [compojure.route :as route]))

(defroutes rm
  (GET "/" [] "<h1>Hello World Wide Web!</h1>")
  (route/not-found "Page not found"))


