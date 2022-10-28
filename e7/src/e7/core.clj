(ns e7.core "10001st Prime"
    (:import [com.sieve Sieve]))

(defn slow-sieve [n]
  (loop [bools (boolean-array n true)
         i 2]
    (aset bools 0 false)
    (aset bools 1 false)
    (if (= 0 (mod i 100)) (prn i) nil)
    (cond
      (> i  (int (Math/sqrt n))) (remove nil? (map-indexed  #(if (true? %2) %1 nil) (vec bools)))
      (true? (nth bools i)) (do
                              (loop [multiples  (map #(+ (* i %) (* i i)) (range 0 n))
                                     idx 0
                                     j (nth multiples 0)]
                                (if (>= j n)
                                  nil
                                  (do (aset bools j false)
                                      (recur multiples (inc idx) (nth multiples (inc idx))))))
                              (recur bools (inc i)))
      :else  (recur bools (inc i)))))

(defn sieve [n]
  (Sieve/sieve n))

