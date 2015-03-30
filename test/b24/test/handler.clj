(ns b24.test.handler
  (:use clojure.test
        ring.mock.request
        b24.handler))

(defn has-title [title response]
  (.contains (:body response) (str "<title>" title "</title>")))

(deftest test-routes
  (testing "main route"
    (let [response (app (request :get "/"))]
      (is (= (:status response) 200))))

  (testing "not-found route"
    (let [response (app (request :get "/invalid"))]
      (is (= (:status response) 404)))))
