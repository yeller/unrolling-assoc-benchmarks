(ns bench-conj-unrolling
  (:require [criterium.core :refer [bench]]))

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
    (conj [] 1 2 3)))

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


(def benches
  {
   "bench-single-empty-vector-conj" bench-single-empty-vector-conj
   "bench-two-element-empty-vector-conj" bench-two-element-empty-vector-conj
   "bench-three-element-empty-vector-conj" bench-three-element-empty-vector-conj
   "bench-four-element-empty-vector-conj" bench-four-element-empty-vector-conj

   "bench-single-twenty-element-vector-conj" bench-single-twenty-element-vector-conj
   "bench-two-element-twenty-element-vector-conj" bench-two-element-twenty-element-vector-conj
   "bench-three-element-twenty-element-vector-conj" bench-three-element-twenty-element-vector-conj
   "bench-four-element-twenty-element-vector-conj" bench-four-element-twenty-element-vector-conj

   "bench-single-empty-list-conj" bench-single-empty-list-conj
   "bench-two-element-empty-list-conj" bench-two-element-empty-list-conj
   "bench-three-element-empty-list-conj" bench-three-element-empty-list-conj
   "bench-four-element-empty-list-conj" bench-four-element-empty-list-conj

   "bench-single-twenty-element-list-conj" bench-single-twenty-element-list-conj
   "bench-two-element-twenty-element-list-conj" bench-two-element-twenty-element-list-conj
   "bench-three-element-twenty-element-list-conj" bench-three-element-twenty-element-list-conj
   "bench-four-element-twenty-element-list-conj" bench-four-element-twenty-element-list-conj

   "bench-single-empty-set-conj" bench-single-empty-set-conj
   "bench-two-element-empty-set-conj" bench-two-element-empty-set-conj
   "bench-three-element-empty-set-conj" bench-three-element-empty-set-conj
   "bench-four-element-empty-set-conj" bench-four-element-empty-set-conj

   "bench-single-twenty-element-set-conj" bench-single-twenty-element-set-conj
   "bench-two-element-twenty-element-set-conj" bench-two-element-twenty-element-set-conj
   "bench-three-element-twenty-element-set-conj" bench-three-element-twenty-element-set-conj
   "bench-four-element-twenty-element-set-conj" bench-four-element-twenty-element-set-conj
   })

(defn -main [& args]
  (let [bench (get benches (first args))]
    (assert bench "not a valid bench")
    (println (str "runnning " (first args) "\n============"))
    (bench)))
