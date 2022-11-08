(ns e11.core-spec
  (:require [speclj.core :refer [describe it should=]]
            [e11.core :refer [greatest-prod-adj-horizontally
                              greatest-prod-adj-vertically
                              greatest-prod-adj
                              diagnols
                              transpose
                              data]]))

(describe "Greatest product adjacent horizontally"
          (it "Should be 0"
              (should= 0 (greatest-prod-adj-horizontally [])))
          (it "Should be 16"
              (should= 16 (greatest-prod-adj-horizontally [[2 2 2 2] [1 1 1 1]])))
          (it "Should be 4"
              (should= 4 (greatest-prod-adj-horizontally [[2 1 2 1 2 1 2]])))
          (it "Should be 8"
              (should= 8 (greatest-prod-adj-horizontally [[2 1 2 1 2 1 2] [2 2 2 1 1 1 1]]))))


(describe "Should turn a list of rows into a list of columns"
          (it "Should be []"
              (should= [] (transpose [])))
          (it "Should be [[1]]"
              (should= [[1]] (transpose [[1]])))
          (it "Should be [[1 2 3 4]]"
              (should= [[1 2 3 4]] (transpose [[1] [2] [3] [4]])))
          (it "Should be [[1 2 3 4] [2 4 6 8]]"
              (should= [[1 2 3 4] [2 4 6 8]] (transpose [[1 2] [2 4] [3 6] [4 8]])))
          (it "Should be [[1 2 3 4 5 7 9 0] [2 4 6 8 9 3 2 1] [1 2 3 4 5 6 7 8]]"
              (should= [[1 2 3 4 5 7 9 0]
                        [2 4 6 8 9 3 2 1]
                        [1 2 3 4 5 6 7 8]] (transpose [[1 2 1]
                                                       [2 4 2]
                                                       [3 6 3]
                                                       [4 8 4]
                                                       [5 9 5]
                                                       [7 3 6]
                                                       [9 2 7]
                                                       [0 1 8]]))))

(describe "Greatest product adjacent vertically"
          (it "Should be 0"
              (should= 0 (greatest-prod-adj-vertically [])))
          (it "Should be 16"
              (should= 16 (greatest-prod-adj-vertically [[2] [2] [2] [2]])))
          (it "Should be 4"
              (should= 4 (greatest-prod-adj-vertically [[2] [1] [2] [1] [2] [1] [2]])))
          (it "Should be 6561"
              (should= 6561 (greatest-prod-adj-vertically [[2 1 2 9]
                                                           [8 2 2 9]
                                                           [9 2 2 9]
                                                           [9 2 2 9]]))))

(describe "Greatest product adjacent"
          (it "Should be 70600674"
              (should= 70600674 (greatest-prod-adj data))))