(ns e10.core-test
  (:require [clojure.test :refer [deftest testing is]]
            [e10.core :refer [sieve]]))

(deftest sum-up-to-2-mil
  (testing "Sum of primes up to 2mil should ="
    (is (= 142913828922 (reduce + (filter #(< % 2000000) (sieve 100000000)))))))
