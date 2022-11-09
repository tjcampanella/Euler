(ns e3.core-spec
  (:require [speclj.core :refer [describe it should=]]
            [e3.core :refer [prime-factors-of]]))

(describe "Prime factors of"
          (it "Should be []"
              (should= [] (prime-factors-of 0)))
          (it "Should be []"
              (should= [] (prime-factors-of 1)))
          (it "Should be [2]"
              (should= [2] (prime-factors-of 2)))
          (it "Should be [3]"
              (should= [3] (prime-factors-of 3)))
          (it "Should be [5]"
              (should= [5] (prime-factors-of 5)))
          (it "Should be [2 3]"
              (should= [2 3] (prime-factors-of 6)))
          (it "Should be [7]"
              (should= [7] (prime-factors-of 7)))
          (it "Should be [2 2 2]"
              (should= [2 2 2] (prime-factors-of 8)))
          (it "Should be [3 3]"
              (should= [3 3] (prime-factors-of 9)))
          (it "Should be [2 5]"
              (should= [2 5] (prime-factors-of 10)))
          (it "Should be [11]"
              (should= [11] (prime-factors-of 11)))
          (it "Should be [2 2 3]"
              (should= [2 2 3] (prime-factors-of 12)))
          (it "Should be [??]"
              (should= [71 839 1471 6857] (prime-factors-of 600851475143))))