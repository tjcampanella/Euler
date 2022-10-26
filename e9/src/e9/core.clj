(ns e9.core "Special Pythagorean Triplet")

(defn gen-triples [target k-limit]
  (let [m-ns (filter #(> (nth % 0) (nth % 1)) (for [x1 (range 2 1000)
                                                    x2 (range 1 1000)]
                                                [x1 x2]))]
    (loop [m (nth (first m-ns) 0)
           n (nth (first m-ns) 1)
           k 1
           res []
           idx 1]
      (let [a (*  k (int (- (Math/pow m 2) (Math/pow n 2))))
            b (* k 2 m n)
            c (* k (int (+ (Math/pow m 2) (Math/pow n 2))))
            next-m (nth (nth m-ns idx) 0)
            next-n (nth (nth m-ns idx) 1)
            next-res (cons [a b c] res)]
        (cond
          (some #(= target (reduce + %)) next-res) [a b c]
          (= k k-limit) (recur next-m next-n 1 next-res (inc idx))
          :else (recur m n (inc k) next-res idx))))))



