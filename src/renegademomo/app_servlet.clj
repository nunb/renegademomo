(ns renegademomo.app_servlet
  (:gen-class :extends javax.servlet.http.HttpServlet)
  (:use renegademomo.core)
  (:use [appengine-magic.servlet :only [make-servlet-service-method]]))


(defn -service [this request response]
  ((make-servlet-service-method renegademomo-app) this request response))
