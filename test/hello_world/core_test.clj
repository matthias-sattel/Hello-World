(ns hello-world.core-test
  (:require [clojure.test :refer :all]
            [hello-world.core :refer :all])
  (:use [midje.sweet]))

(deftest a-test
  (testing "Fixed."
    (is (= 1 1))))

(deftest ring-handler
  (testing 
      (is (=
           (handler {})
           {:status 200, :headers {"Content-Type" "text/html"}, :body "<h1>Hello World!</h1>"})
          )))

(facts "Testing midje"
       (fact
        true => true))
