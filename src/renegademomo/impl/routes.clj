(ns renegademomo.impl.routes
  (:use [compojure.core :only [defroutes GET]])
  (:require [compojure.route :as route]
            [renegademomo.impl.handlers.index :as index]))

(defroutes rm
  (GET "/" [] (index/handle))
  (route/not-found "404"))              ; GAE currently does not
                                        ; support custom error messages


