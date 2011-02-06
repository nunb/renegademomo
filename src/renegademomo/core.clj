(ns renegademomo.core
  (:require [appengine-magic.core :as ae])
  (:use [renegademomo.impl.routes :only [rm]]))


(ae/def-appengine-app renegademomo-app #'rm)
