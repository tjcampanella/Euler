(ns e14.core "Longest Collatz Sequence")

(defn collatz
  ([start]
   (collatz start []))
  ([curr res]
   (cond
     (= curr 1) (conj res 1)
     (even? curr) (collatz (/ curr 2) (conj res curr))
     :else (collatz (inc (* 3 curr)) (conj res curr)))))

(defn find-longest-collatz [limit]
  (loop [curr-max 1 start-max 1 vals (range 1 limit)]
    (let [res (collatz (first vals))
          length (count res)]
      (cond
        (empty? (rest vals)) [start-max curr-max]
        (> length curr-max) (recur length (first vals) (rest vals))
        :else (recur curr-max start-max (rest vals))))))

