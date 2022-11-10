(ns e13.core-spec
  (:require [speclj.core :refer [describe it should=]]
            [e13.core :refer [first-10-of-sum]]))

(describe "First 10 digits of large sum"
          (it "Should equal 5537376230"
              (should= 5537376230 first-10-of-sum)))
