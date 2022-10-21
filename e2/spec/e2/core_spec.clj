(ns e2.core-spec
  (:require [speclj.core :as spec]
            [e2.core :as core]))

(spec/describe "Sum of even fibonacci numbers below 4M"
               (spec/it "Should create the fibonnaci sequence for the first 10 nums"
                        (spec/should= [1 1 2 3 5 8 13 21 34 55] (core/fib_lst 10))))
