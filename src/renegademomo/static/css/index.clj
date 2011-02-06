(ns renegademomo.static.css.index
  (:require [gaka.core :as gaka]))

(def rules
  [:p
   :color "#FF00FF"])

(gaka/save-css "resources/static/css/index.css" rules)
