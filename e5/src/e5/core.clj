(ns e5.core "Smallest mulitple")

(def get-rem
  (memoize
   (fn [dividend divisor]
     (rem dividend divisor))))

(defn smallest-mulitple [limit]
  (loop [divisors (range 1 (inc limit))
         dividend limit
         idx 0
         curr-rem (get-rem dividend (nth divisors idx))
         curr-mul nil]
    (cond
      (= idx (- limit 1)) curr-mul
      (= 0 curr-rem) (recur divisors dividend (inc idx) (get-rem dividend (nth divisors (inc idx))) dividend)
      :else (recur divisors (+ dividend limit) 0 (get-rem (+ dividend limit) (nth divisors 0)) curr-mul))))
