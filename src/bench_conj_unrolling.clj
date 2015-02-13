(ns bench-conj-unrolling
  (:require [criterium.core :refer [bench]]))

(defmacro bench [& args]
  `(criterium.core/bench ~@args))

(defn bench-single-empty-vector-conj []
  (bench
    (conj [] 1)))

(defn bench-two-element-empty-vector-conj []
  (bench
    (conj [] 1 2)))

(defn bench-three-element-empty-vector-conj []
  (bench
    (conj [] 1 2 3)))

(defn bench-four-element-empty-vector-conj []
  (bench
    (conj [] 1 2 3 4)))

(defn bench-two-element-empty-vector-conj-unrolled []
  (bench
    (-> []
      (conj 1)
      (conj 2))))

(defn bench-three-element-empty-vector-conj-unrolled []
  (bench
    (-> []
      (conj 1)
      (conj 2)
      (conj 3))))

(defn bench-four-element-empty-vector-conj-unrolled []
  (bench
    (-> []
      (conj 1)
      (conj 2)
      (conj 3)
      (conj 4))))

(def twenty-elem-vector
  (into [] (range 20)))

(defn bench-single-twenty-element-vector-conj []
  (bench
    (conj twenty-elem-vector 1)))

(defn bench-two-element-twenty-element-vector-conj []
  (bench
    (conj twenty-elem-vector 1 2)))

(defn bench-three-element-twenty-element-vector-conj []
  (bench
    (conj twenty-elem-vector 1 2 3)))

(defn bench-four-element-twenty-element-vector-conj []
  (bench
    (conj twenty-elem-vector 1 2 3)))

(defn bench-two-element-twenty-element-vector-conj-unrolled []
  (bench
    (-> twenty-elem-vector
      (conj 1)
      (conj 2))))

(defn bench-three-element-twenty-element-vector-conj-unrolled []
  (bench
    (-> twenty-elem-vector
      (conj 1)
      (conj 2)
      (conj 3))))

(defn bench-four-element-twenty-element-vector-conj-unrolled []
  (bench
    (-> twenty-elem-vector
      (conj 1)
      (conj 2)
      (conj 3)
      (conj 4))))

(defn bench-single-empty-list-conj []
  (bench
    (conj '() 1)))

(defn bench-two-element-empty-list-conj []
  (bench
    (conj '() 1 2)))

(defn bench-three-element-empty-list-conj []
  (bench
    (conj '() 1 2 3)))

(defn bench-four-element-empty-list-conj []
  (bench
    (conj '() 1 2 3)))

(defn bench-two-element-empty-list-conj-unrolled []
  (bench
    (-> '()
      (conj 1)
      (conj 2))))

(defn bench-three-element-empty-list-conj-unrolled []
  (bench
    (-> '()
      (conj 1)
      (conj 2)
      (conj 3))))

(defn bench-four-element-empty-list-conj-unrolled []
  (bench
    (-> '()
      (conj 1)
      (conj 2)
      (conj 3)
      (conj 4))))

(def twenty-element-list (into '() (range 20)))

(defn bench-single-twenty-element-list-conj []
  (bench
    (conj twenty-element-list 1)))

(defn bench-two-element-twenty-element-list-conj []
  (bench
    (conj twenty-element-list 1 2)))

(defn bench-three-element-twenty-element-list-conj []
  (bench
    (conj twenty-element-list 1 2 3)))

(defn bench-four-element-twenty-element-list-conj []
  (bench
    (conj twenty-element-list 1 2 3)))

(defn bench-two-element-twenty-element-list-conj-unrolled []
  (bench
    (-> twenty-element-list
      (conj 1)
      (conj 2))))

(defn bench-three-element-twenty-element-list-conj-unrolled []
  (bench
    (-> twenty-element-list
      (conj 1)
      (conj 2)
      (conj 3))))

(defn bench-four-element-twenty-element-list-conj-unrolled []
  (bench
    (-> twenty-element-list
      (conj 1)
      (conj 2)
      (conj 3)
      (conj 4))))

(defn bench-single-empty-set-conj []
  (bench
    (conj #{} 1)))

(defn bench-two-element-empty-set-conj []
  (bench
    (conj #{} 1 2)))

(defn bench-three-element-empty-set-conj []
  (bench
    (conj #{} 1 2 3)))

(defn bench-four-element-empty-set-conj []
  (bench
    (conj #{} 1 2 3)))

(defn bench-two-element-empty-set-conj-unrolled []
  (bench
    (-> #{}
      (conj 1)
      (conj 2))))

(defn bench-three-element-empty-set-conj-unrolled []
  (bench
    (-> #{}
      (conj 1)
      (conj 2)
      (conj 3))))

(defn bench-four-element-empty-set-conj-unrolled []
  (bench
    (-> #{}
      (conj 1)
      (conj 2)
      (conj 3)
      (conj 4))))

(def twenty-element-set (into #{} (range 20)))

(defn bench-single-twenty-element-set-conj []
  (bench
    (conj twenty-element-set 1)))

(defn bench-two-element-twenty-element-set-conj []
  (bench
    (conj twenty-element-set 1 2)))

(defn bench-three-element-twenty-element-set-conj []
  (bench
    (conj twenty-element-set 1 2 3)))

(defn bench-four-element-twenty-element-set-conj []
  (bench
    (conj twenty-element-set 1 2 3)))

(defn bench-two-element-twenty-element-set-conj-unrolled []
  (bench
    (-> twenty-element-set
      (conj 1)
      (conj 2))))

(defn bench-three-element-twenty-element-set-conj-unrolled []
  (bench
    (-> twenty-element-set
      (conj 1)
      (conj 2)
      (conj 3))))

(defn bench-four-element-twenty-element-set-conj-unrolled []
  (bench
    (-> twenty-element-set
      (conj 1)
      (conj 2)
      (conj 3)
      (conj 4))))

(def benches
  {
   "bench-single-empty-vector-conj" bench-single-empty-vector-conj
   "bench-two-element-empty-vector-conj" bench-two-element-empty-vector-conj
   "bench-three-element-empty-vector-conj" bench-three-element-empty-vector-conj
   "bench-four-element-empty-vector-conj" bench-four-element-empty-vector-conj

   "bench-two-element-empty-vector-conj-unrolled" bench-two-element-empty-vector-conj-unrolled
   "bench-three-element-empty-vector-conj-unrolled" bench-three-element-empty-vector-conj-unrolled
   "bench-four-element-empty-vector-conj-unrolled" bench-four-element-empty-vector-conj-unrolled

   "bench-single-twenty-element-vector-conj" bench-single-twenty-element-vector-conj
   "bench-two-element-twenty-element-vector-conj" bench-two-element-twenty-element-vector-conj
   "bench-three-element-twenty-element-vector-conj" bench-three-element-twenty-element-vector-conj
   "bench-four-element-twenty-element-vector-conj" bench-four-element-twenty-element-vector-conj

   "bench-two-element-twenty-element-vector-conj-unrolled" bench-two-element-twenty-element-vector-conj-unrolled
   "bench-three-element-twenty-element-vector-conj-unrolled" bench-three-element-twenty-element-vector-conj-unrolled
   "bench-four-element-twenty-element-vector-conj-unrolled" bench-four-element-twenty-element-vector-conj-unrolled

   "bench-single-empty-list-conj" bench-single-empty-list-conj
   "bench-two-element-empty-list-conj" bench-two-element-empty-list-conj
   "bench-three-element-empty-list-conj" bench-three-element-empty-list-conj
   "bench-four-element-empty-list-conj" bench-four-element-empty-list-conj

   "bench-two-element-empty-list-conj-unrolled" bench-two-element-empty-list-conj-unrolled
   "bench-three-element-empty-list-conj-unrolled" bench-three-element-empty-list-conj-unrolled
   "bench-four-element-empty-list-conj-unrolled" bench-four-element-empty-list-conj-unrolled

   "bench-single-twenty-element-list-conj" bench-single-twenty-element-list-conj
   "bench-two-element-twenty-element-list-conj" bench-two-element-twenty-element-list-conj
   "bench-three-element-twenty-element-list-conj" bench-three-element-twenty-element-list-conj
   "bench-four-element-twenty-element-list-conj" bench-four-element-twenty-element-list-conj

   "bench-two-element-twenty-element-list-conj-unrolled" bench-two-element-twenty-element-list-conj-unrolled
   "bench-three-element-twenty-element-list-conj-unrolled" bench-three-element-twenty-element-list-conj-unrolled
   "bench-four-element-twenty-element-list-conj-unrolled" bench-four-element-twenty-element-list-conj-unrolled

   "bench-single-empty-set-conj" bench-single-empty-set-conj
   "bench-two-element-empty-set-conj" bench-two-element-empty-set-conj
   "bench-three-element-empty-set-conj" bench-three-element-empty-set-conj
   "bench-four-element-empty-set-conj" bench-four-element-empty-set-conj

   "bench-two-element-empty-set-conj-unrolled" bench-two-element-empty-set-conj-unrolled
   "bench-three-element-empty-set-conj-unrolled" bench-three-element-empty-set-conj-unrolled
   "bench-four-element-empty-set-conj-unrolled" bench-four-element-empty-set-conj-unrolled

   "bench-single-twenty-element-set-conj" bench-single-twenty-element-set-conj
   "bench-two-element-twenty-element-set-conj" bench-two-element-twenty-element-set-conj
   "bench-three-element-twenty-element-set-conj" bench-three-element-twenty-element-set-conj
   "bench-four-element-twenty-element-set-conj" bench-four-element-twenty-element-set-conj

   "bench-two-element-twenty-element-set-conj-unrolled" bench-two-element-twenty-element-set-conj-unrolled
   "bench-three-element-twenty-element-set-conj-unrolled" bench-three-element-twenty-element-set-conj-unrolled
   "bench-four-element-twenty-element-set-conj-unrolled" bench-four-element-twenty-element-set-conj-unrolled
   })

(defn -main [& args]
  (let [bench (get benches (first args))]
    (assert bench "not a valid bench")
    (println (str "runnning " (first args) "\n============"))
    (bench)))
