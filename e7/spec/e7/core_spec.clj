(ns e7.core-spec
  (:require [speclj.core :as s]
            [e7.core :refer [sieve]]))

(s/describe "Sieve"
            (s/it "Primes between 2 and 7"
                  (s/should= [2 3 5] (sieve 7)))
            (s/it "Primes between 2 and 20"
                  (s/should= [2 3 5 7 11 13 17 19] (sieve 20)))
            (s/it "Primes between 2 and 30"
                  (s/should= [2 3 5 7 11 13 17 19 23 29] (sieve 30)))
            (s/it "Primes between 2 and 100"
                  (s/should= [2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97] (sieve 100)))
            (s/it "Should find 10001st Prime"
                  (let [result (sieve 105000)]
                    (s/should= 104743 (nth result 10000)))))
