(ns b24.views.layout
  (:require [hiccup.page :refer [html5 include-css]]))

(defn common [title & body]
  (html5
    [:head
     [:title title]
     (include-css "/css/screen.css")]
    [:body body]))
