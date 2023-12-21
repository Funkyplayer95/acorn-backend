package FinalProject.TagMatch.Service;

import FinalProject.TagMatch.Entity.Contents;
import FinalProject.TagMatch.Repository.ContentsRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Transactional
public class ContentsService {
    private final ContentsRepository contentsRepository;


    public String[] getPlatformRank(int MN, List<String> platformid) {
        LocalDate endDate = LocalDate.now();
        LocalDate startDate = endDate.minusDays(MN);
        List<Contents> rank = contentsRepository.findByCrawlingdateBetween(startDate, endDate);
        List<String> items = new ArrayList<>();

        for (Contents contents : rank) {
            if (platformid.contains(contents.getPlatformid())) {
                String[] gtagsArray = contents.getGtags()
                        .replaceAll("\\[|\\]|'|#|\\s", "")
                        .split(",");
                items.addAll(Arrays.asList(gtagsArray));
            }
        }
        return items.toArray(String[]::new);
    }
    public Map<String, Integer> gTagCount(String[] tagList) {
        Map<String, Integer> countMap = new HashMap<>();

        // 배열을 순회하면서 등장 횟수 계산
        for (String str : tagList) {
            if(str.isEmpty()){
                continue;
            }
            // 기존에 해당 문자열이 맵에 있는지 확인
            if (countMap.containsKey(str)) {
                // 있으면 기존 값에 1 추가
                countMap.put(str, countMap.get(str) + 1);
            } else {
                // 없으면 새로운 키로 추가
                countMap.put(str, 1);
            }
        }
        // 결과 출력
        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        return countMap;
    }

    public <K, V extends Comparable<? super V>> Map<K, V> sortByValueDesc(Map<K, V> map) {
        return map.entrySet()
                .stream()
                .sorted(Map.Entry.<K, V>comparingByValue().reversed())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));
    }

}
