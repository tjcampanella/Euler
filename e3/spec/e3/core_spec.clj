(ns e3.core-spec
  (:require [speclj.core :refer [describe it should=]]
            [e3.core :refer [prime-factors-of]]))

(describe "Prime factors of"
          (it "Should be []"
              (should= [] (prime-factors-of 0)))
          (it "Should be [1]"
              (should= [1] (prime-factors-of 1)))
          (it "Should be [1 2]"
              (should= [1 2] (prime-factors-of 2)))
          (it "Should be [1 3]"
              (should= [1 3] (prime-factors-of 3)))
          (it "Should be [1 5]"
              (should= [1 5] (prime-factors-of 5)))
          (it "Should be [1 2 3]"
              (should= [1 2 3] (prime-factors-of 6)))
          (it "Should be [1 7]"
              (should= [1] (prime-factors-of 7)))
          (it "Should be [1 2]"
              (should= [1 2] (prime-factors-of 8)))
          (it "Should be [??]"
              (should= [] (prime-factors-of 600851475143))))