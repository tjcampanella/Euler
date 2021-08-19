(ns e1.core)

(defn -main
  [& args]
  (println "Hello World"))

(defn gen-mul-seq [step]
  (range step 1000 step))

(defn uniques [seq]
  (vec (apply sorted-set seq)))

(defn combine-seqs [seq1 seq2]
  (uniques (concat seq1 seq2)))

(defn mult? [mul1 mul2 num]
  (or (= 0 (rem num mul1)) (= 0 (rem num mul2))))

(defn mults [mul1 mul2 seq]
  (filter #(mult? mul1 mul2 %) seq))
