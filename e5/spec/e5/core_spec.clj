(ns e5.core-spec
  (:require [speclj.core :as s]
            [e5.core :refer [smallest-mulitple]]))

(s/describe "Smallest Mulitple"
            (s/it "Should = 2520 for 1-10"
                  (s/should= 2520 (smallest-mulitple 10)))
            (s/it "Should = ? for 1-20"
                  (s/should= 232792560 (smallest-mulitple 20))))