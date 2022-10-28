(ns e10.core "Sum of Primes up to 2 Million"
    (:import [com.sieve Sieve]))

;; Calling sieve from e7
(defn sieve [n]
  (Sieve/sieve n))
