(ns e2.core-spec
  (:require [speclj.core :refer :all]
            [e2.core :refer :all]))

(describe "Sum of even fibonacci numbers below 4M"
          (it "Should create the fibonnaci sequence"
              (should= [1 2 3 5 8 13 21 34 55 89] (take 10 (fib)))))
