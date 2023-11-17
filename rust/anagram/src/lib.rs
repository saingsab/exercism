use std::collections::HashSet;

// normalize charactors by alphabet a->z
fn normalize(s: &str) -> String {
    let mut s_vec = s.to_lowercase().chars().collect::<Vec<char>>();
    s_vec.sort_unstable();
    
    s_vec.iter().collect()
}

pub fn anagrams_for<'a>(word: &str, possible_anagrams: &[&'a str]) -> HashSet<&'a str> {
    let n_word = normalize(word).to_lowercase();
    possible_anagrams
        .iter()
        .filter(|s| s.to_lowercase() != word.to_lowercase() && normalize(s) == n_word)
        .copied()
        .collect()

}
