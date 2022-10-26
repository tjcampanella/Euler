(ns e9.core-spec
  (:require [speclj.core :refer [describe it should=]]
            [e9.core :refer [gen-triples]]))

(describe "Generate Triples"
          (it "Should return [3 4 5] when looking for sum 12"
              (should= [3 4 5] (gen-triples 12 10)))
          (it "Should return [16 30 34] when looking for sum 80"
              (should= [30 16 34] (gen-triples 80 20)))
          (it "Should return [375 200 425] when looking for sum 1000"
              (should= [375 200 425] (gen-triples 1000 20))))
