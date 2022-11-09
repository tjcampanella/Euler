(ns e12.core-spec
  (:require [speclj.core :refer [describe it should=]]
            [e12.core :refer [factors-of
                              gen-triangle-numbers
                              find-first-triangle-500-divs]]))

(describe "Factors of"
          (it "Should be []"
              (should= [] (factors-of 0)))
          (it "Should be []"
              (should= [] (factors-of 1)))
          (it "Should be [2]"
              (should= [1 2] (factors-of 2)))
          (it "Should be [3]"
              (should= [1 3] (factors-of 3)))
          (it "Should be [5]"
              (should= [1 5] (factors-of 5)))
          (it "Should be [2 3]"
              (should= [1 2 3] (factors-of 6)))
          (it "Should be [7]"
              (should= [1 7] (factors-of 7)))
          (it "Should be [2 4]"
              (should= [1 2 4] (factors-of 8)))
          (it "Should be [3]"
              (should= [1 3] (factors-of 9)))
          (it "Should be [2 5]"
              (should= [1 2 5] (factors-of 10)))
          (it "Should be [11]"
              (should= [1 11] (factors-of 11)))
          (it "Should be [2 3 4 6]"
              (should= [1 2 3 4 6] (factors-of 12))))

(describe "Gen triangle Numbers"
          (it "Should be []"
              (should= [] (gen-triangle-numbers 0)))
          (it "Should be [1]"
              (should= [1] (gen-triangle-numbers 1)))
          (it "Should be [1 3]"
              (should= [1 3] (gen-triangle-numbers 2)))
          (it "Should be [1 3 6]"
              (should= [1 3 6] (gen-triangle-numbers 3)))
          (it "Should be [1 3 6 10 15 21 28 36 45 55]"
              (should= [1 3 6 10 15 21 28 36 45 55] (gen-triangle-numbers 10))))


(describe "Find first triangle num with 500+ divisors"
          (it "Should be 76576500"
              (should= 76576500 (find-first-triangle-500-divs))))