(ns e8.core-spec
  (:require [speclj.core :refer [describe it should=]]
            [e8.core :refer [largest-prod nums]]))

(describe "Largest Product in a Series"
          (it "Should return 12 for a window of 2"
              (should= 12 (largest-prod 2 [1 2 3 4])))
          (it "Should return 729 for a window of 3"
              (should= 729 (largest-prod 3 [1 2 3 4 2 4 6 9 1 3 9 9 9])))
          (it "Should return 5832 for a window of 4"
              (should= 5832 (largest-prod 4 [9 9 9 8 2 3 4 5 6 7 8 2 1 4 5 0])))
          (it "Should return 45927 for a window of 5"
              (should= 45927 (largest-prod 5 [1 2 3 4 2 3 5 6 9 9 7 9 9 2 1 9 9 3 2 9])))
          (it "Should return 531441 for a window of 6"
              (should= 531441 (largest-prod 6 [1 2 3 4 2 3 5 6 9 9 7 9 9 2 1 9 9 3 2 9 8 3 4 9 9 9 9 9 9 5 6 7 1 2 3 4])))

          (it "Should return 5832 for a window of 4 from data.txt"
              (should= 5832 (largest-prod 4 nums)))
          (it "Should return 0 for a window of 100 from data.txt"
              (should= 0 (largest-prod 100 nums)))
          (it "Should return 23514624000 for a window of 13 from data.txt"
              (should= 23514624000 (largest-prod 13 nums))))
