(ns e14.core-spec
  (:require [speclj.core :refer [describe it should=]]
            [e14.core :refer [collatz find-longest-collatz-fast]]))

(describe "Collatz"
          (it "Should equal collatz sequence starting at 13 "
              (should= [13 40 20 10 5 16 8 4 2 1] (collatz 13))))

(describe "Longest Collatz up to 1M"
          (it "Should equal ? "
              (should= [837799 525] (find-longest-collatz-fast 1000000))))