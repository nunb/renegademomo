(ns renegademomo.impl.views.index
  (:use [hiccup.core :only [html]])
  (:require [hiccup.page-helpers :as ph]))

(defn render
  []
  (ph/html5 
   [:head
    [:h1 "Welcome!"]]
   [:body
    [:p "I'm a pretty paragraph"]]))
