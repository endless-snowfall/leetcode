grep -R Tags /Users/anthony/Documents/workspace/leetcode/ | grep -v -e \/bin\/ -e common -e \.sh | awk -FTags: '{print$2}' | tr , '\n' | sed -e "s/^ *//" | sed -e "s/ *$//" | sort | uniq -c | grep -Ei --color '$|Tricky|Unfinished|Reworked|Incorrect|Bad Assumptions|NullPointerException'
