(ns renegademomo.impl.views.index
  (:use [hiccup.core :only [html]])
  (:require [hiccup.page-helpers :as ph]))

(defn render
  []
  (ph/html5 
   [:head
    (ph/include-css "static/css/index.css")]
   [:body
    [:p "I'm a pretty paragraph"]
    (ph/include-js "static/js/index.js")]))
