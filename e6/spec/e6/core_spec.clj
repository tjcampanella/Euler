(ns e6.core-spec
  (:require [speclj.core :as s]
            [e6.core :refer [sum-square-diff]]))

(s/describe "Sum Square Difference"
            (s/it "Should be 2640 for 1-10"
                  (s/should= 2640 (sum-square-diff 10)))
            (s/it "Should be 25164150 for 1-100"
                  (s/should= 25164150 (sum-square-diff 100))))
