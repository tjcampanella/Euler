(ns e1.core-spec
  (:require [speclj.core :refer :all]
            [e1.core :refer :all]))

(def threes (gen-mul-seq 3))
(def fives (gen-mul-seq 5))

(describe "Sum of mulitples for 3 and 5 in a given range"
          (it "Generates sequence for a given range"
              (should= 10 (count (range 10))))

          (it "should generate a sequence of mulitples of 1"
              (should= [1 2 3 4] (take 4 (gen-mul-seq 1))))
          (it "should generate a sequence of mulitples of 2"
              (should= [2 4 6 8] (take 4 (gen-mul-seq 2))))
          (it "should remove duplicates from a sequence"
              (should= [3 6 9 12 15] (uniques [3 6 9 9 12 15 15])))
          (it "should combine two sequences filter by their multiples"
              (should= [3 5 6 9 10 12 15]
                       (take 7 (combine-seqs threes fives))))
          (it "should return true if number is a mult of 3 and 5"
              (should=  true (mult? 3 5 15)))
          (it "should generate a list of mults of 3 and 5 from their combined seq"
              (should=  [3 5 6 9] (take 4 (mults 3 5 (combine-seqs threes fives)))))
          (it "should generate sum of multiples of 3 and 5 to 1000"
              (should= 233168 (reduce + (filter #(< % 1000) (mults 3 5 (combine-seqs threes fives)))))))
