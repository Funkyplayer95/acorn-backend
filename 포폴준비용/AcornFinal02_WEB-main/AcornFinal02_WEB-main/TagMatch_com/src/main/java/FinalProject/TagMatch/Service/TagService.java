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

    public List<TagDTO> taginfo(String tagid) {
        List<Tag> tt = tagRepository.findAllByOrderByTagcountDesc();
        List<TagDTO> tdt = new ArrayList<TagDTO>();

        for (Tag en : tt) {
            TagDTO DTList = new TagDTO(
                    en.getTagid(),
                    en.getTagcount()
            );
            tdt.add(DTList);
        }

        return tdt;
    }

////////////////////////////////////////////////////////////////
    public Optional<Tag> getTag(String id){
        return tagRepository.findById(id);
    }

    public String[] getRTag(String id){
        String Rtag=getTag(id).get().getRtags();
        String[] items = Rtag.replaceAll("\\[|\\]|'|#|\\s+", "").split(",");
        return items;
    }
}
