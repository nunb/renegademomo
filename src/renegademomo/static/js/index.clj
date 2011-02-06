(ns renegademomo.static.js.index
  (:use [com.reasonr.scriptjure :only [js]])
  (:require [clojure.contrib.io :as io]))

(def rules
  (js
   (alert "Hello there!")))

(io/spit "resources/static/js/index.js" rules)
