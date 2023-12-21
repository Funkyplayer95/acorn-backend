package FinalProject.TagMatch.Service;

import FinalProject.TagMatch.DTO.TagDTO;
import FinalProject.TagMatch.Entity.Tag;
import FinalProject.TagMatch.Repository.TagRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
public class TagService {

    private final TagRepository tagRepository;

    public List<TagDTO> taginfo() {
        List<Tag> tt = tagRepository.findAllByOrderByTagcountDesc();
        List<TagDTO> tdt = new ArrayList<>();

        for (Tag en : tt) {
            TagDTO DTList = new TagDTO(
                    en.getTagid(),
                    en.getTagcount()
            );
            tdt.add(DTList);
        }

        return tdt;
    }


    public String[] getRTag(String id){
        String Rtag=tagRepository.findById(id).get().getRtags();
        String[] items = Rtag.replaceAll("\\[|\\]|'|#|\\s+", "").split(",");
        return items;
    }
}
