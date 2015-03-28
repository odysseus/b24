(ns b24.routes.home
  (:require [compojure.core :refer :all]
            [b24.views.layout :as layout]))

(defn home []
  (layout/common [:h1 "Hello World!"]))

(defroutes home-routes
  (GET "/" [] (home)))
